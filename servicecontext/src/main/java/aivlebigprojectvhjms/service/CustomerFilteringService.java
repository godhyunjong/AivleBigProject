package aivlebigprojectvhjms.service;

import aivlebigprojectvhjms.domain.CustomerInfo;
import aivlebigprojectvhjms.domain.dto.FilterCriteria;
import aivlebigprojectvhjms.infra.CustomerInfoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class CustomerFilteringService {

    private final CustomerInfoRepository repository;

    public CustomerFilteringService(CustomerInfoRepository repository) {
        this.repository = repository;
    }

    public List<CustomerInfo> filterCustomers(FilterCriteria criteria) {
        return ((List<CustomerInfo>) repository.findAll()).stream()
            // minAge, maxAge 필터링 제거됨
            .filter(c -> criteria.getGender() == null || c.getGender().equals(criteria.getGender()))
            .filter(c -> criteria.getIsMarried() == null || c.getIsMarriage().equals(criteria.getIsMarried()))
            .filter(c -> criteria.getHasChildren() == null || c.getHasChildren().equals(criteria.getHasChildren()))
            .filter(c -> criteria.getDiseaseFree() == null || (criteria.getDiseaseFree() && c.getDisease().isEmpty()))
            .collect(Collectors.toList());
    }
}