diff --git a/graylog2-server/src/main/java/org/graylog2/shared/rest/resources/ProxiedResource.java b/graylog2-server/src/main/java/org/graylog2/shared/rest/resources/ProxiedResource.java
index 9d6b10d..af6eed2 100644
--- a/graylog2-server/src/main/java/org/graylog2/shared/rest/resources/ProxiedResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/shared/rest/resources/ProxiedResource.java
@@ -54,22 +54,22 @@
         }
     }
 
-    protected <T, K> Map<String, Optional<K>> getForAllNodes(Function<T, Call<K>> fn, Function<String, Optional<T>> interfaceProvider) {
+    protected <RemoteInterfaceType, RemoteCallResponseType> Map<String, Optional<RemoteCallResponseType>> getForAllNodes(Function<RemoteInterfaceType,Call<RemoteCallResponseType>> fn, Function<String, Optional<RemoteInterfaceType>> interfaceProvider) {
         return getForAllNodes(fn, interfaceProvider, Function.identity());
     }
 
-    protected <T, K, L> Map<String, Optional<K>> getForAllNodes(Function<T, Call<L>> fn, Function<String, Optional<T>> interfaceProvider, Function<L, K> transformer) {
+    protected <RemoteInterfaceType, FinalResponseType, RemoteCallResponseType> Map<String, Optional<FinalResponseType>> getForAllNodes(Function<RemoteInterfaceType, Call<RemoteCallResponseType>> fn, Function<String, Optional<RemoteInterfaceType>> interfaceProvider, Function<RemoteCallResponseType, FinalResponseType> transformer) {
         return this.nodeService.allActive()
             .entrySet()
             .stream()
             .collect(Collectors.toMap(Map.Entry::getKey, entry -> {
-                final Optional<T> remoteInterface = interfaceProvider.apply(entry.getKey());
+                final Optional<RemoteInterfaceType> remoteInterface = interfaceProvider.apply(entry.getKey());
                 if (!remoteInterface.isPresent()) {
                     return Optional.empty();
                 }
-                final Call<L> call = fn.apply(remoteInterface.get());
+                final Call<RemoteCallResponseType> call = fn.apply(remoteInterface.get());
                 try {
-                    final Response<L> response = call.execute();
+                    final Response<RemoteCallResponseType> response = call.execute();
                     if (response.isSuccess()) {
                         return Optional.of(transformer.apply(response.body()));
                     } else {
@@ -83,7 +83,7 @@
             }));
     }
 
-    protected <T> Function<String, Optional<T>> createRemoteInterfaceProvider(Class<T> interfaceClass) {
+    protected <RemoteInterfaceType> Function<String, Optional<RemoteInterfaceType>> createRemoteInterfaceProvider(Class<RemoteInterfaceType> interfaceClass) {
         return (nodeId) -> {
             try {
                 final Node targetNode = nodeService.byNodeId(nodeId);
