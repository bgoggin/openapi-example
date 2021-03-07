package com.github.phillipkruger.openapi;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.servers.Servers;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("/")
@OpenAPIDefinition(info = @Info(
      title = "Greeting version",
      version = "1.0.0",
      contact = @Contact(
            name="Bill Goggin",
            email = "bill@anyconnected.com"
      )),
      servers = {
            @Server(url = "/", description = "localhost"),
            @Server(url = "https:aws.whatever.com:3000/", description = "Prod")
      }

)
public class ApplicationConfig extends Application {
}
