package kz.aitu.ochenverycoolzoo.services;
import kz.aitu.ochenverycoolzoo.models.Action;
import kz.aitu.ochenverycoolzoo.repositories.ActionRepositoryInterface;
import kz.aitu.ochenverycoolzoo.services.interfaces.ActionServiceInterface;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionService implements ActionServiceInterface {
    private final ActionRepositoryInterface repo;

    public ActionService(ActionRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Action> getAll() {
        return repo.findAll();
    }

    @Override
    public Action getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Action create(Action action) {
        return repo.save(action);
    }
}
