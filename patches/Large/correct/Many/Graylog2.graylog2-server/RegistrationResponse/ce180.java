diff --git a/graylog2-server/src/main/java/org/graylog/plugins/sidecar/rest/responses/RegistrationResponse.java b/graylog2-server/src/main/java/org/graylog/plugins/sidecar/rest/responses/RegistrationResponse.java
index ac919d6..604b2a0 100644
--- a/graylog2-server/src/main/java/org/graylog/plugins/sidecar/rest/responses/RegistrationResponse.java
+++ b/graylog2-server/src/main/java/org/graylog/plugins/sidecar/rest/responses/RegistrationResponse.java
@@ -31,28 +31,28 @@
 @AutoValue
 @JsonAutoDetect
 public abstract class RegistrationResponse {
-    @JsonProperty
-    public abstract SidecarRegistrationConfiguration collectorRegistrationConfiguration();
+    @JsonProperty("configuration")
+    public abstract SidecarRegistrationConfiguration configuration();
 
-    @JsonProperty
+    @JsonProperty("configuration_override")
     public abstract boolean configurationOverride();
 
-    @JsonProperty
+    @JsonProperty("actions")
     @Nullable
     public abstract List<CollectorAction> actions();
 
-    @JsonProperty
+    @JsonProperty("assignments")
     @Nullable
     public abstract List<ConfigurationAssignment> assignments();
 
     @JsonCreator
     public static RegistrationResponse create(
-            @JsonProperty("configuration") SidecarRegistrationConfiguration sidecarRegistrationConfiguration,
+            @JsonProperty("configuration") SidecarRegistrationConfiguration configuration,
             @JsonProperty("configuration_override") boolean configurationOverride,
             @JsonProperty("actions") @Nullable List<CollectorAction> actions,
             @JsonProperty("assignments") @Nullable List<ConfigurationAssignment> assignments) {
         return new AutoValue_RegistrationResponse(
-                sidecarRegistrationConfiguration,
+                configuration,
                 configurationOverride,
                 actions,
                 assignments);
