package cn.org.zhixiang.controller;

import cn.org.zhixiang.domain.Order;
import cn.org.zhixiang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

//    @RequestMapping(value = "/add", method={RequestMethod.GET})
//    public String toaddorder(Model model) {
//        if(!model.containsAttribute("or_command")) {
//            Order or = new Order();
//
//            model.addAttribute("or_command", or);
//        }
//        return "add_";
//    }
//    @RequestMapping(value = "doadd",method={RequestMethod.POST})
//    public  String addItem(Model model,@ModelAttribute("or_command")Order order4Add){
//        orderService.add(order4Add);
//        return  "success";
//    }


    //添加订单
    @RequestMapping(value = "/add")
    public String toaddorder(Order order) {
        return "add_";
    }
    @RequestMapping(value = "/doadd")
    public  String addorder(Order order){
        System.out.println(order);
        if(orderService.add(order)==1){
            return  "success";
        }
        else return "false";
    }

    //查询全部订单
    @RequestMapping(value = "/list")
    public String find(Model model){
        List<Order> orderList=orderService.findAll();
        model.addAttribute("list",orderList);
        return  "list_";
    }
    //通过id查询订单
    @RequestMapping(value = "/orderId/{orderId}")
    public Order findByOrderId(@PathVariable int orderId) {
        return orderService.findItemById(orderId);
    }

    //通过更新订单
    @RequestMapping(value = "/toupdate")
    public String toupdate(Model model, Order order) {
        System.out.println(order.toString());
        model.addAttribute("o",order);
        return "update";
    }

    @RequestMapping(value = "/update")
    public String update(Model model,@ModelAttribute("o")Order order4){
        orderService.update(order4);
        return "Upsuccess";
    }

    //通过id删除订单
    @RequestMapping(value = "/delete" )
    public String delete(@RequestParam int  productId) {
        System.out.println(productId);
        orderService.delete(productId);
        return "redirect:/order/list";
    }


}

