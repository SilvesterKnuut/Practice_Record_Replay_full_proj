<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Practice_TSC_1_Different__suites_on_different_browsers</name>
   <tag></tag>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <runConfigurationId>Firefox</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Practice_TS_1</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Practice_TS_2</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
