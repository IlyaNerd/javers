package org.javers.model.mapping;

import org.javers.core.model.DummyAddress;
import org.javers.core.model.DummyUser;
import org.javers.core.model.DummyUserDetails;
import org.javers.model.mapping.type.TypeMapper;
import org.testng.annotations.BeforeMethod;

import static org.javers.test.builder.TypeMapperTestBuilder.typeMapper;

/**
 * @author bartosz walacik
 */
public class EntityIdFromBeanTest extends EntityIdTest {

    @BeforeMethod
    public void setUp() {

        TypeMapper mapper = typeMapper().registerValueObject(DummyUserDetails.class).build();
        entityFactory = new BeanBasedEntityFactory(mapper);
    }
}
