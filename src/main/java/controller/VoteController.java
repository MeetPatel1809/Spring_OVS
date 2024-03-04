package controller;

import entities.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.VoteService;

@RestController
@RequestMapping("/api/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;

    @PostMapping("/create")
    public Vote createVote(@RequestBody Vote vote) {
        return voteService.createVote(vote);
    }

    // Add other endpoints as needed
}
