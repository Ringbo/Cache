diff --git a/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDaoTest.java b/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDaoTest.java
index 2ae2b30..c5af29f 100644
--- a/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDaoTest.java
+++ b/server/sonar-db-dao/src/test/java/org/sonar/db/component/ComponentDaoTest.java
@@ -716,7 +716,7 @@
 
     assertThat(keys).containsOnly(view.getDbKey());
 
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project.uuid())))
       .isEqualTo(keys);
   }
 
@@ -735,23 +735,23 @@
 
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, singleton(project1.uuid())))
       .containsOnly(view.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project1.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project1.uuid())))
       .containsOnly(view.getDbKey());
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, singleton(project2.uuid())))
       .containsOnly(view.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project2.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project2.uuid())))
       .containsOnly(view.getDbKey());
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, singleton(project3.uuid())))
       .containsOnly(view2.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project3.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project3.uuid())))
       .containsOnly(view2.getDbKey());
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, of(project2.uuid(), project1.uuid())))
       .containsOnly(view.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project2.uuid(), project1.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project2.uuid(), project1.uuid())))
       .containsOnly(view.getDbKey());
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, of(project1.uuid(), project3.uuid())))
       .containsOnly(view.getDbKey(), view2.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project1.uuid(), project3.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project1.uuid(), project3.uuid())))
       .containsOnly(view.getDbKey(), view2.getDbKey());
   }
 
@@ -770,7 +770,7 @@
 
     assertThat(keys).containsOnly(view2.getDbKey());
 
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project2.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project2.uuid())))
       .isEqualTo(keys);
   }
 
@@ -788,7 +788,7 @@
 
     assertThat(keys).containsOnly(view1.getDbKey());
 
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project.uuid())))
       .isEqualTo(keys);
   }
 
@@ -806,7 +806,7 @@
 
     assertThat(keys).containsOnly(view2.getDbKey());
 
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project.uuid())))
       .isEqualTo(keys);
   }
 
@@ -823,7 +823,7 @@
 
     assertThat(keys).containsOnly(view.getDbKey());
 
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project.uuid())))
       .isEqualTo(keys);
   }
 
@@ -844,23 +844,23 @@
 
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, singleton(project1.uuid())))
       .containsOnly(view1.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project1.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project1.uuid())))
       .containsOnly(view1.getDbKey());
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, singleton(project2.uuid())))
       .containsOnly(view1.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project2.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project2.uuid())))
       .containsOnly(view1.getDbKey());
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, singleton(project3.uuid())))
       .containsOnly(view2.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project3.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project3.uuid())))
       .containsOnly(view2.getDbKey());
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, of(project2.uuid(), project1.uuid())))
       .containsOnly(view1.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project2.uuid(), project1.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project2.uuid(), project1.uuid())))
       .containsOnly(view1.getDbKey());
     assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, of(project1.uuid(), project3.uuid())))
       .containsOnly(view1.getDbKey(), view2.getDbKey());
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project1.uuid(), project3.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project1.uuid(), project3.uuid())))
       .containsOnly(view1.getDbKey(), view2.getDbKey());
   }
 
@@ -881,7 +881,7 @@
 
     assertThat(keys).containsOnly(view2.getDbKey());
 
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project2.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project2.uuid())))
       .isEqualTo(keys);
   }
 
@@ -901,7 +901,7 @@
 
     assertThat(keys).containsOnly(view1.getDbKey());
 
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project.uuid())))
       .isEqualTo(keys);
   }
 
@@ -921,7 +921,7 @@
 
     assertThat(keys).containsOnly(view2.getDbKey());
 
-    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithInexistingUuids(project.uuid())))
+    assertThat(underTest.selectViewKeysWithEnabledCopyOfProject(dbSession, shuffleWithNonExistentUuids(project.uuid())))
       .isEqualTo(keys);
   }
 
@@ -2052,7 +2052,7 @@
     return underTest.selectByUuid(db.getSession(), uuid).get().isPrivate();
   }
 
-  private static Set<String> shuffleWithInexistingUuids(String... uuids) {
+  private static Set<String> shuffleWithNonExistentUuids(String... uuids) {
     return Stream.concat(
       IntStream.range(0, 1 + new Random().nextInt(5)).mapToObj(i -> randomAlphabetic(9)),
       Arrays.stream(uuids))
