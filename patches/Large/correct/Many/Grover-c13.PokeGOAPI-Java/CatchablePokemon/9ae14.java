diff --git a/library/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java b/library/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
index 275dce8..650062d 100644
--- a/library/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
+++ b/library/src/main/java/com/pokegoapi/api/map/pokemon/CatchablePokemon.java
@@ -556,7 +556,7 @@
 								api.getInventories().updateInventories();
 							}
 
-							CatchResult res = new CatchResult();
+							CatchResult res = new CatchResult(response);
 							res.setStatus(response.getStatus());
 							return res;
 						} catch (RemoteServerException e) {
