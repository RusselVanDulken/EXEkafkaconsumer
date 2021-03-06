package cn.itcast.asset.utils;

import cn.itcast.asset.model.message;
import cn.itcast.asset.service.MasscanService;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author: RyuZUSUNC
 * @create: 2022-03-07 14:35
 **/

@Component
public class TopicMessageListener {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    MasscanService masscanService;

    @KafkaListener(topics = "topic_test", groupId = "group1")
    public void onHydraMessage(@Payload String message) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Calendar calendar = Calendar.getInstance();
        String dateName = df.format(calendar.getTime());

        String msg = message;
        logger.info("received test message: {}",msg);
        message mes = new message();
        mes.setId(dateName);
        mes.setMasscan(msg);
        masscanService.insert(mes);
    }

    @SuppressWarnings("unchecked")
    private static <T> Class<T> getType(String type) {
        try {
            return (Class<T>) Class.forName(type);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
