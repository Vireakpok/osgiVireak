package com.khalibre.training.command.osgi;

import com.khalibre.trainig.service.api.api.ServiceApi;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = {
                "osgi.command.function=tell",
                "osgi.command.scope=p-training-service-api"
        },
        service = Command.class
)
public class Command {
    public void tell(){
        System.out.println(myApi.myTime() + "   vireak");
    }
    @Reference
    private ServiceApi myApi;
}
