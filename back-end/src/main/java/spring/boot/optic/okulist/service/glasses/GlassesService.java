package spring.boot.optic.okulist.service.glasses;

import java.util.List;
import org.springframework.data.domain.Pageable;
import spring.boot.optic.okulist.dto.glasses.GlassesRequestDto;
import spring.boot.optic.okulist.dto.glasses.GlassesResponseDto;

public interface GlassesService {
    List<GlassesResponseDto> findAll(Pageable pageable);

    GlassesResponseDto getById(Long id);

    GlassesResponseDto save(GlassesRequestDto glassesRequestDto);

    void deleteById(Long id);

    public List<GlassesResponseDto> findSimilar(GlassesRequestDto glassesRequestDto);

    public GlassesResponseDto update(Long id, GlassesRequestDto glassesRequestDto);
}
