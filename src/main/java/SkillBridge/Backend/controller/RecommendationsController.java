package SkillBridge.Backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://localhost:4173"
})
public class RecommendationsController {

    private final List<Map<String, Object>> jobs = List.of(
        Map.of(
            "roleId", 1,
            "title", "Data Analyst",
            "matchScore", 75,
            "summary", "Analyze data and create reports and dashboards."
        ),
        Map.of(
            "roleId", 2,
            "title", "Python Developer",
            "matchScore", 67,
            "summary", "Build applications and solve problems using Python."
        ),
        Map.of(
            "roleId", 3,
            "title", "SQL Developer",
            "matchScore", 50,
            "summary", "Work with databases, queries, and data management."
        )
    );

    @GetMapping("/recommendations")
    public List<Map<String, Object>> getRecommendations() {
        return jobs;
    }
}