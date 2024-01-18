package org.gabrielbarrilli.restwithspringbootandjavaerudio.controller;

import org.gabrielbarrilli.restwithspringbootandjavaerudio.service.MathService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo)
            throws Exception {

        return mathService.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
                              @PathVariable(value = "numberTwo") String numberTwo)
            throws Exception {

        return mathService.subtraction(numberOne, numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
                                 @PathVariable(value = "numberTwo") String numberTwo)
            throws Exception {

        return mathService.multiplication(numberOne, numberTwo);
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo)
            throws Exception {

        return mathService.division(numberOne, numberTwo);
    }

    @RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double average(@PathVariable(value = "numberOne") String numberOne,
                          @PathVariable(value = "numberTwo") String numberTwo)
            throws Exception {

        return mathService.average(numberOne, numberTwo);
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable(value = "number") String number)
            throws Exception {

        return mathService.squareRoot(number);
    }

}
