package cn.itcast.asset.web;

import cn.itcast.asset.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 7w1st22
 * @date 2022/3/22	当前系统日期
 * @time 14:13	当前系统时间
 */
@RestController
@RequestMapping("/asset")
public class AssetcController {
    @Autowired
    private AssetService assetService;

    @GetMapping("/ip")
    public String showAllAsset_IP() throws Exception {
        return assetService.showasset();
    }
}
