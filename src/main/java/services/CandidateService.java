package services;

import entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CandidateRepository;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    public Candidate createCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    // Implement other methods as needed
}
