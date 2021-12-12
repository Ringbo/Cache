diff --git a/sonar-plugin-api/src/main/java/org/sonar/api/rule/RuleDefinitions.java b/sonar-plugin-api/src/main/java/org/sonar/api/rule/RuleDefinitions.java
index 8b9f470..f8113dd 100644
--- a/sonar-plugin-api/src/main/java/org/sonar/api/rule/RuleDefinitions.java
+++ b/sonar-plugin-api/src/main/java/org/sonar/api/rule/RuleDefinitions.java
@@ -42,7 +42,7 @@
   /**
    * Instantiated by core but not by plugins.
    */
-  public static class Context {
+  static class Context {
     private final Map<String, NewRepository> newRepositories = Maps.newHashMap();
     private final ListMultimap<String, ExtendedRepository> extendedRepositories = ArrayListMultimap.create();
 
@@ -86,7 +86,7 @@
     }
   }
 
-  public static interface ExtendedRepository {
+  static interface ExtendedRepository {
     String key();
 
     NewRule newRule(String ruleKey);
@@ -97,7 +97,7 @@
     List<NewRule> getRules();
   }
 
-  public static class NewRepository implements ExtendedRepository {
+  static class NewRepository implements ExtendedRepository {
     private final String key;
     private String language;
     private String name;
@@ -170,12 +170,11 @@
     }
   }
 
-  public static class NewRule {
+  static class NewRule {
     private final String repoKey, key;
     private String name, htmlDescription, metadata, defaultSeverity = Severity.MAJOR;
     private final Set<String> tags = Sets.newHashSet();
     private final Map<String, NewParam> params = Maps.newHashMap();
-    // TODO cardinality ? or template boolean ?
 
     public NewRule(String repoKey, String key) {
       this.repoKey = repoKey;
@@ -192,7 +191,7 @@
 
     public NewRule setName(String s) {
       if (StringUtils.isBlank(s)) {
-        throw new IllegalArgumentException("Name of rule " + this + " is blank");
+        throw new IllegalArgumentException(String.format("Name of rule %s is blank", this));
       }
       this.name = s;
       return this;
@@ -204,7 +203,7 @@
 
     public NewRule setDefaultSeverity(String s) {
       if (!Severity.ALL.contains(s)) {
-        throw new IllegalArgumentException("Default severity of rule " + this + " is not correct: " + s);
+        throw new IllegalArgumentException(String.format("Default severity of rule %s is not correct: %s", this, s));
       }
       this.defaultSeverity = s;
       return this;
@@ -217,7 +216,7 @@
 
     public NewRule setHtmlDescription(String s) {
       if (StringUtils.isBlank(s)) {
-        throw new IllegalArgumentException("HTML description of rule " + this + " is blank");
+        throw new IllegalArgumentException(String.format("HTML description of rule %s is blank", this));
       }
       this.htmlDescription = s;
       return this;
@@ -225,7 +224,7 @@
 
     public NewParam newParam(String paramKey) {
       if (params.containsKey(paramKey)) {
-        throw new IllegalArgumentException("The parameter '" + key + "' is declared several times on the rule " + this);
+        throw new IllegalArgumentException(String.format("The parameter '%s' is declared several times on the rule %s", paramKey, this));
       }
       NewParam param = new NewParam(this, paramKey);
       params.put(paramKey, param);
@@ -308,7 +307,7 @@
     }
   }
 
-  public static class NewParam {
+  static class NewParam {
     private final NewRule rule;
     private final String key;
     private String name, description, defaultValue;
