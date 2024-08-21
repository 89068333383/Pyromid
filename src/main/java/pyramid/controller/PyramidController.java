package pyramid.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pyramid.service.PyramideServise;


@Controller
@RequestMapping("/weight")
public class PyramidController {

    @Autowired
    private PyramideServise servise;

    @GetMapping("/{level}/{index}")
    public ResponseEntity<String> weight(@PathVariable int level, @PathVariable int index) {

        System.out.println(" level = " +  level +  " - " + "index = " + index);

        var res = servise.getHumanEdgeWeight(level, index);
        System.out.println(res);
        return new ResponseEntity<>("level="+level + "\n" + "index = " + index  + " massa2 = " + res.toString(), HttpStatus.OK);
    }
}
