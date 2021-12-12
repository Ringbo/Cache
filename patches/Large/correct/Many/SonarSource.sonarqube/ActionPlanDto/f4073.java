diff --git a/sonar-core/src/main/java/org/sonar/core/issue/db/ActionPlanDto.java b/sonar-core/src/main/java/org/sonar/core/issue/db/ActionPlanDto.java
index cbdade5..8090c77 100644
--- a/sonar-core/src/main/java/org/sonar/core/issue/db/ActionPlanDto.java
+++ b/sonar-core/src/main/java/org/sonar/core/issue/db/ActionPlanDto.java
@@ -32,7 +32,7 @@
  */
 public class ActionPlanDto {
 
-  private Integer id;
+  private Long id;
   private String kee;
   private String name;
   private String description;
@@ -43,11 +43,11 @@
   private Date createdAt;
   private Date updatedAt;
 
-  public Integer getId() {
+  public Long getId() {
     return id;
   }
 
-  public ActionPlanDto setId(Integer id) {
+  public ActionPlanDto setId(Long id) {
     this.id = id;
     return this;
   }
