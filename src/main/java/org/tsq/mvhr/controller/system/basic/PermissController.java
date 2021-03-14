package org.tsq.mvhr.controller.system.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsq.mvhr.model.Menu;
import org.tsq.mvhr.model.Role;
import org.tsq.mvhr.service.MenuService;
import org.tsq.mvhr.service.PermissService;

import java.util.List;

/**
 * @Author tsq
 * @Date 2021/3/7 17:30
 * @Description:
 */

@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {

    @Autowired
    PermissService permissService;
    @Autowired
    MenuService menuService;

    @GetMapping("/")
    public List<Role> getAllRoles() {
        return permissService.getAllRoles();
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }
}
