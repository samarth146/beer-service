package com.msscbeerservice.web.mappers;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import com.brewery.model.BeerDto;
import com.msscbeerservice.domain.Beer;


@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
