<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS Make Appointment</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>0571881c-6ca0-4797-b6ae-c2e185415c7d</testSuiteGuid>
   <testCaseLink>
      <guid>922adf6d-ccda-4c63-b0b2-2e9ceb4cd93d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenarios/Functional Testing/02_Make Appoinment/01_MA Success</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>99cad44b-9489-4f80-8e75-60f097b36b56</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenarios/Functional Testing/02_Make Appoinment/01_MA Success - Verify</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>83e27a8c-4a94-4398-a38d-6e03080b2156</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/katalonData/validMA</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>83e27a8c-4a94-4398-a38d-6e03080b2156</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>hospital_checkbox</value>
         <variableId>28672588-7ebb-4cc6-8a7c-677dcc5ea1df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>83e27a8c-4a94-4398-a38d-6e03080b2156</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>hc_program</value>
         <variableId>99f49b76-c12d-4d58-9414-9ad66e8a227b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>83e27a8c-4a94-4398-a38d-6e03080b2156</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>facility</value>
         <variableId>6df7a91e-139b-4833-b11c-8ac58b943ad3</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5cac18e2-770d-4d01-b36e-03bbd281e3b0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenarios/Functional Testing/02_Make Appoinment/02_MA Fail</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
