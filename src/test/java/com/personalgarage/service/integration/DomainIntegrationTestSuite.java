package com.personalgarage.service.integration;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CarIntegrationTest.class,
        TransactionIntegrationTest.class
})
public class DomainIntegrationTestSuite {
}