package com.skyon.project.system.controller;

import com.skyon.common.utils.poi.ExcelUtil;
import com.skyon.framework.aspectj.lang.annotation.Log;
import com.skyon.framework.aspectj.lang.enums.BusinessType;
import com.skyon.framework.web.controller.BaseController;
import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.framework.web.page.TableDataInfo;
import com.skyon.project.system.domain.ferghana.TDataResultSource;
import com.skyon.project.system.service.ITDataResultSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 * 
 *
 * @date 2020-05-31
 */
@RestController
@RequestMapping("/source/result")
public class TDataResultSourceController extends BaseController
{
    @Autowired
    private ITDataResultSourceService tDataResultSourceService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('source:result:list')")
    @GetMapping("/list")
    public TableDataInfo list(TDataResultSource tDataResultSource)
    {
        startPage();
        List<TDataResultSource> list = tDataResultSourceService.selectTDataResultSourceList(tDataResultSource);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('source:result:export')")
    // @log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TDataResultSource tDataResultSource)
    {
        List<TDataResultSource> list = tDataResultSourceService.selectTDataResultSourceList(tDataResultSource);
        ExcelUtil<TDataResultSource> util = new ExcelUtil<TDataResultSource>(TDataResultSource.class);
        return util.exportExcel(list, "source");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('source:result:query')")
    @GetMapping(value = "/{dataResultSourceId}")
    public AjaxResult getInfo(@PathVariable("dataResultSourceId") Long dataResultSourceId)
    {
        return AjaxResult.success(tDataResultSourceService.selectTDataResultSourceById(dataResultSourceId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('source:result:add')")
    // @log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TDataResultSource tDataResultSource)
    {
        return toAjax(tDataResultSourceService.insertTDataResultSource(tDataResultSource));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('source:result:edit')")
    // @log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TDataResultSource tDataResultSource)
    {
        return toAjax(tDataResultSourceService.updateTDataResultSource(tDataResultSource));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('source:result:remove')")
    // @log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dataResultSourceIds}")
    public AjaxResult remove(@PathVariable Long[] dataResultSourceIds)
    {
        return toAjax(tDataResultSourceService.deleteTDataResultSourceByIds(dataResultSourceIds));
    }
}
