/**
 * projectName: community
 * fileName: HelloController.java
 * packageName: com.popperdone.community.Controller
 * date: 2019-11-27 21:28
 * copyright(c) 2017-2020 xxx公司
 */
package com.popperdone.community.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version: V1.0
 * @author: fendo
 * @className: HelloController
 * @packageName: com.popperdone.community.Controller
 * @description:
 * @data: 2019-11-27 21:28
 **/
@Controller
public class HelloController {

    @GetMapping("/")
    private String index(){
        return "index";
    }
}
