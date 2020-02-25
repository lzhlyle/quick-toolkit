package com.lzhlyle.quick.toolkit.web.api;

import com.lzhlyle.quick.toolkit.utils.HttpRequestUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/proxy")
public class ProxyRest {

    /**
     * proxy get
     *
     * @param url
     * @return
     */
    @ApiOperation(value = "proxy get")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get(@RequestParam String url, HttpServletRequest request) {
        if (url == null || url.trim().length() < 1) return "";
        return HttpRequestUtils.sendGet(url, null);
//        if (regex == null) return html;
//        Matcher matcher = Pattern.compile(regex).matcher(html);
//        return matcher.group(1);
    }
}
