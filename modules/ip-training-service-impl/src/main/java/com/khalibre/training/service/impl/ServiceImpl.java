package com.khalibre.training.service.impl;

import com.khalibre.trainig.service.api.api.ServiceApi;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

@Component(
        service = ServiceApi.class
)
public class ServiceImpl implements ServiceApi {
    @Override
    public String myTime() {
        return new Date().toString();
    }
}
