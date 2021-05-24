package hrms.hrmsproject.api.controllers;


import hrms.hrmsproject.business.abstracts.JobPositionService;
import hrms.hrmsproject.core.utilities.results.DataResult;
import hrms.hrmsproject.core.utilities.results.Result;
import hrms.hrmsproject.entities.concretes.JobPositon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jobpositions")
public class JobPositionControllers {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionControllers(JobPositionService jobPositionService) {
        super();
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobPositon>> getAll() {
        return this.jobPositionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPositon jobPositon) {
        return this.jobPositionService.add(jobPositon);
    }

    @GetMapping("/getbyid/{id}")
    public DataResult<JobPositon> getById(@PathVariable int id) {
        return this.jobPositionService.getById(id);
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody JobPositon jobPositon) {
        return this.jobPositionService.delete(jobPositon);
    }

}
