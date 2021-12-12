diff --git a/hibernate-core/src/test/java/org/hibernate/test/joinedsubclassbatch/IdentityJoinedSubclassBatchingTest.java b/hibernate-core/src/test/java/org/hibernate/test/joinedsubclassbatch/IdentityJoinedSubclassBatchingTest.java
index 4f15fe4..20eae4f 100644
--- a/hibernate-core/src/test/java/org/hibernate/test/joinedsubclassbatch/IdentityJoinedSubclassBatchingTest.java
+++ b/hibernate-core/src/test/java/org/hibernate/test/joinedsubclassbatch/IdentityJoinedSubclassBatchingTest.java
@@ -246,7 +246,7 @@
 
 		@Id
 		@GeneratedValue(strategy = GenerationType.IDENTITY)
-		private String id;
+		private Integer id;
 
 		@Column(nullable = false, length = 80)
 		private String name;
@@ -286,11 +286,11 @@
 			this.sex = sex;
 		}
 
-		public String getId() {
+		public Integer getId() {
 			return id;
 		}
 
-		public void setId(String id) {
+		public void setId(Integer id) {
 			this.id = id;
 		}
 
