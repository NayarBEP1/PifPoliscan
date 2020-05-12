package com.poliscan.infrastructure.adapter.repository;

import com.poliscan.domain.model.dto.DtoArea;
import com.poliscan.domain.model.entity.Area;
import com.poliscan.domain.port.repository.RepositoryArea;
import com.poliscan.infrastructure.adapter.repository.mapper.MapperArea;
import com.poliscan.infrastructure.entity.EntityArea;
import com.poliscan.infrastructure.jparepository.JpaAreaRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryAreaImpl implements RepositoryArea {

    private JpaAreaRepository jpaAreaRepository;
    private MapperArea mapperArea = new MapperArea();

    public RepositoryAreaImpl(JpaAreaRepository jpaAreaRepository) {
        this.jpaAreaRepository = jpaAreaRepository;
    }

    @Override
    public DtoArea createArea(Area area) {
        ObjectId objectId = new ObjectId();
        area.setId(objectId.toString());
        EntityArea entityArea = this.mapperArea.modelToEntity(area);
        EntityArea entityAreaSaved = this.jpaAreaRepository.save(entityArea);
        return this.mapperArea.entityToDto(entityAreaSaved);
    }

    @Override
    public DtoArea updateArea(Area area) {
        EntityArea entityArea = this.mapperArea.modelToEntity(area);
        EntityArea entityAreaUpdated = this.jpaAreaRepository.save(entityArea);
        return this.mapperArea.entityToDto(entityAreaUpdated);
    }

    @Override
    public List<DtoArea> listArea() {
        return this.mapperArea.entityToDtoList(this.jpaAreaRepository.findAll());
    }

    @Override
    public void deleteArea(String id) {
        this.jpaAreaRepository.deleteById(id);
    }
}
