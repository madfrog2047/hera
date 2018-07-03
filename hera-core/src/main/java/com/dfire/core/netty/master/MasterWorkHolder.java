package com.dfire.core.netty.master;

import com.dfire.core.message.HeartBeatInfo;
import io.netty.channel.Channel;
import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 16:13 2018/1/12
 * @desc
 */

@Data
public class MasterWorkHolder {

    private Channel channel;

    private Map<String, Boolean> running = new ConcurrentHashMap<>();

    private Map<String, Boolean> manningRunning = new ConcurrentHashMap<>();

    private Map<String, Boolean> debugRunning = new ConcurrentHashMap<>();

    public HeartBeatInfo heartBeatInfo;

    public MasterWorkHolder(Channel channel) {
        this.channel = channel;
    }

}
