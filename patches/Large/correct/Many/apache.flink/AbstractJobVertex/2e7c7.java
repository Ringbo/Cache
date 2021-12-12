diff --git a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/AbstractJobVertex.java b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/AbstractJobVertex.java
index e9f4a94..295b9f4 100644
--- a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/AbstractJobVertex.java
+++ b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/AbstractJobVertex.java
@@ -126,7 +126,7 @@
 	 *         thrown if the given vertex cannot be connected to <code>vertex</code> in the requested manner
 	 */
 	public void connectTo(final AbstractJobVertex vertex) throws JobGraphDefinitionException {
-		this.connectTo(vertex, null, null, -1, -1, DistributionPattern.BIPARTITE, false);
+		this.connectTo(vertex, null, null, -1, -1, DistributionPattern.BIPARTITE, true);
 	}
 
 	/**
@@ -145,7 +145,7 @@
 	 */
 	public void connectTo(final AbstractJobVertex vertex, final int indexOfOutputGate, final int indexOfInputGate)
 			throws JobGraphDefinitionException {
-		this.connectTo(vertex, null, null, indexOfOutputGate, indexOfInputGate, DistributionPattern.BIPARTITE, false);
+		this.connectTo(vertex, null, null, indexOfOutputGate, indexOfInputGate, DistributionPattern.BIPARTITE, true);
 	}
 
 	/**
@@ -162,7 +162,7 @@
 	 */
 	public void connectTo(final AbstractJobVertex vertex, final ChannelType channelType,
 			final CompressionLevel compressionLevel) throws JobGraphDefinitionException {
-		this.connectTo(vertex, channelType, compressionLevel, -1, -1, DistributionPattern.BIPARTITE, false);
+		this.connectTo(vertex, channelType, compressionLevel, -1, -1, DistributionPattern.BIPARTITE, true);
 	}
 
 	/**
@@ -182,7 +182,7 @@
 	public void connectTo(final AbstractJobVertex vertex, final ChannelType channelType,
 			final CompressionLevel compressionLevel, final DistributionPattern distributionPattern)
 			throws JobGraphDefinitionException {
-		this.connectTo(vertex, channelType, compressionLevel, -1, -1, distributionPattern, false);
+		this.connectTo(vertex, channelType, compressionLevel, -1, -1, distributionPattern, true);
 	}
 
 	/**
@@ -234,7 +234,7 @@
 			final CompressionLevel compressionLevel, int indexOfOutputGate, int indexOfInputGate,
 			final DistributionPattern distributionPattern) throws JobGraphDefinitionException {
 		this.connectTo(vertex, channelType, compressionLevel, indexOfOutputGate, indexOfInputGate, distributionPattern,
-			false);
+			true);
 	}
 
 	/**
