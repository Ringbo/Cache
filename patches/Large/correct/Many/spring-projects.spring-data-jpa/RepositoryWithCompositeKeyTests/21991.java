diff --git a/src/test/java/org/springframework/data/jpa/repository/RepositoryWithCompositeKeyTests.java b/src/test/java/org/springframework/data/jpa/repository/RepositoryWithCompositeKeyTests.java
index 758ad75..3416f27 100644
--- a/src/test/java/org/springframework/data/jpa/repository/RepositoryWithCompositeKeyTests.java
+++ b/src/test/java/org/springframework/data/jpa/repository/RepositoryWithCompositeKeyTests.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2013-2014 the original author or authors.
+ * Copyright 2013-2016 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -48,6 +48,7 @@
  * Tests some usage variants of composite keys with spring data jpa.
  * 
  * @author Thomas Darimont
+ * @author Mark Paluch
  */
 @RunWith(SpringJUnit4ClassRunner.class)
 @ContextConfiguration(classes = SampleConfig.class)
@@ -114,6 +115,7 @@
 
 	/**
 	 * @see DATAJPA-472
+	 * @see DATAJPA-912
 	 */
 	@Test
 	public void shouldSupportFindAllWithPageableAndEntityWithIdClass() throws Exception {
@@ -133,7 +135,7 @@
 		emp.setDepartment(dep);
 		emp = employeeRepositoryWithIdClass.save(emp);
 
-		Page<IdClassExampleEmployee> page = employeeRepositoryWithIdClass.findAll(new PageRequest(0, 10));
+		Page<IdClassExampleEmployee> page = employeeRepositoryWithIdClass.findAll(new PageRequest(0, 1));
 
 		assertThat(page, is(notNullValue()));
 		assertThat(page.getTotalElements(), is(1L));
