package com.sun.moon.service.convert;

import com.sun.moon.beans.DiscussPostBean;
import com.sun.moon.model.vo.DiscussPostVO;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

/**
 * @author li
 */
@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface DiscussPostConvertMappers {
    DiscussPostConvertMappers MAPPERS= Mappers.getMapper(DiscussPostConvertMappers.class);

    /**
     * 帖子bean转vo
     * @param discussPostBean
     * @return
     */
    DiscussPostVO convertVo(DiscussPostBean discussPostBean);
}
