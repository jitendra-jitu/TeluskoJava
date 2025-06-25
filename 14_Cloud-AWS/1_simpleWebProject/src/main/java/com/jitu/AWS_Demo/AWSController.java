package com.jitu.AWS_Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSController {

    @GetMapping("/")
    public String welcome() {

        System.out.println("Welcome to AWS Demo");
        return "Welcome to AWS Demo";

    }

//    @GetMapping("/info")
    @GetMapping(value = "/info", produces = "text/plain")
    public String info(){

        String os=System.getProperty("os.name");
        String version=System.getProperty("os.version");
        String arch=System.getProperty("os.arch");
        String user=System.getProperty("user.name");
        String java=System.getProperty("java.version");
        String java_home=System.getProperty("java.home");
        String java_vendor=System.getProperty("java.vendor");
        String java_vendor_url=System.getProperty("java.vendor.url");
        String java_vm=System.getProperty("java.vm.name");
        String java_vm_version=System.getProperty("java.vm.version");
        String java_vm_vendor=System.getProperty("java.vm.vendor");
        String java_vm_vendor_url=System.getProperty("java.vm.vendor.url");
        String java_vm_info=System.getProperty("java.vm.info");
        String java_vm_specification=System.getProperty("java.vm.specification.name");


        System.out.println("OS Name: " + os);
        System.out.println("OS Version: " + version);
        System.out.println("OS Architecture: " + arch);
        System.out.println("User Name: " + user);
        System.out.println("Java Version: " + java);
        System.out.println("Java Home: " + java_home);
        System.out.println("Java Vendor: " + java_vendor);
        System.out.println("Java Vendor URL: " + java_vendor_url);
        System.out.println("Java VM Name: " + java_vm);
        System.out.println("Java VM Version: " + java_vm_version);
        System.out.println("Java VM Vendor: " + java_vm_vendor);
        System.out.println("Java VM Vendor URL: " + java_vm_vendor_url);
        System.out.println("Java VM Info: " + java_vm_info);
        System.out.println("Java VM Specification Name: " + java_vm_specification);


        return "OS Name: " + os + "\n" +
                "OS Version: " + version + "\n" +
                "OS Architecture: " + arch + "\n" +
                "User Name: " + user + "\n" +
                "Java Version: " + java + "\n" +
                "Java Home: " + java_home + "\n" +
                "Java Vendor: " + java_vendor + "\n" +
                "Java Vendor URL: " + java_vendor_url + "\n" +
                "Java VM Name: " + java_vm + "\n" +
                "Java VM Version: " + java_vm_version + "\n" +
                "Java VM Vendor: " + java_vm_vendor + "\n" +
                "Java VM Vendor URL: " + java_vm_vendor_url + "\n" +
                "Java VM Info: " + java_vm_info + "\n" +
                "Java VM Specification Name: " + java_vm_specification;
    }
}
