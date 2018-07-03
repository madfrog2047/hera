package com.dfire.common.service;

import com.dfire.common.entity.HeraGroup;
import com.dfire.common.entity.model.HeraJobBean;

import java.util.List;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 下午5:01 2018/4/17
 * @desc
 */
public interface HeraGroupService {

    HeraGroup getRootGroup();

    /**
     * 获取上游任务以及组
     *
     * @param jobId
     * @return
     */
    HeraJobBean getUpstreamJobBean(String jobId);

    int insert(HeraGroup heraGroup);

    int delete(int id);

    int update(HeraGroup heraGroup);

    List<HeraGroup> getAll();

    HeraGroup findById(int id);

    List<HeraGroup> findByIds(List<Integer> list);

    List<HeraGroup> findByParent(int parentId);

    List<HeraGroup> findByOwner(String owner);

}
