package com.sleuth.userservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author yy.zhang yangyang.zhang@anxincloud.com
 * @Description
 * @date 2017/12/15 12:36
 */
@RequestMapping("/user")
@RestController
@Api(value = "test-UserController", description = "test")
public class UserController {
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    @ApiOperation(value = "hi", notes = "hi-method")
    @ApiImplicitParam(name = "name", value = "name", required = true, dataType = "String", paramType = "path")
    public String hi(@PathVariable String name) {
        return "hi,how are you!" + name;
    }
}
