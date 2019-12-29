package com.example.nilesh.springbootlinkgit.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("nilesh/api")
@Api(description = "Product Controller for get and set Products")
public class ProductController {

    @ApiOperation("Returns list of Products")
    @GetMapping("/products")
    public String  getProducts()
    {
        return "Hi Hellow";
    }

    @ApiOperation("Returns Product using Product ID")
    @RequestMapping(value = "/{id}", method= RequestMethod.GET)
    public String  getProductById(@ApiParam("Product ID") @PathVariable String id)
    {
        return "Hi Welcome to one product!";
    }
}
