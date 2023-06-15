package de.DayOfWeek.DayOfWeekproject.controller;


import de.DayOfWeek.DayOfWeekproject.enums.DayOfWeekEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/days")
    public class DayOfWeekController {

        @GetMapping("/{day}")
        public String getDayOfWeek(@PathVariable("day") String day) {
            try {
                DayOfWeekEnum dayOfWeek = DayOfWeekEnum.valueOf(day.toUpperCase());
                return dayOfWeek.getRussianName();
            } catch (IllegalArgumentException e) {
                return "Некорректный день недели";
            }
        }
}
