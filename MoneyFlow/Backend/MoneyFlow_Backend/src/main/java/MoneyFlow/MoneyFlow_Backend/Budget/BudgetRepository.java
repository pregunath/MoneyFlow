package MoneyFlow.MoneyFlow_Backend.Budget;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BudgetRepository extends JpaRepository<Budget, UUID> {
    /**
     * Finds a family by its UUID.
     *
     * @param id The UUID of the family.
     * @return An Optional containing the family if found, otherwise empty.
     */
    Optional<Budget> findById(UUID id);
}
