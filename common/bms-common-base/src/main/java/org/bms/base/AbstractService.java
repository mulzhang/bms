package org.bms.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

public abstract class AbstractService<M extends BaseMapper<T>, T extends AbstractEntity> extends ServiceImpl<M, T> {
}
