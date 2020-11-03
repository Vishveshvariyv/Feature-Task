import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Feature;
import com.example.demo.repository.FeatureRepository;
import com.example.service.FeatureService;

@RestController
@CrossOrigin(origins = "*") // To relax the same origin policy.
@RequestMapping("/api/v1")
public class EnrolleeController {

    @Autowired
    private FeatureRepository featureService;

    // This request will create a new feature.
    @PostMapping(path = "/feature/create")
    public Feature postEnrollee(@RequestBody Feature feature) {
    	featureService.addToRepo(feature);
        return feature;
    }


}
