package services;

import entities.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.VoteRepository;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public Vote createVote(Vote vote) {
        return voteRepository.save(vote);
    }

    // Implement other methods as needed
}
