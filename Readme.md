## The dataset of the paper titled "Context-Aware Code Change Embedding for Better Patch Correctness Assessment".

This is the online repository of the paper "Context-Aware Code Change Embedding for Better Patch Correctness Assessment". We release the source code of Cache, the patches used in our evaluation, as well as the experiment results.

* Patches: two patch benchmarks included in our study. 
  * Samll: The 1,183 deduplicated patches from Tian's [ASE20](https://conf.researchr.org/details/ase-2020/ase-2020-papers/3/Evaluating-Representation-Learning-of-Code-Changes-for-Predicting-Patch-Correctness-i) paper and Wang's [ASE20](https://conf.researchr.org/details/ase-2020/ase-2020-papers/54/Automated-Patch-Correctness-Assessment-How-Far-are-We-) paper.
  
  * Large: The patches collected by ourselves, which is consist of 49,694 patches from [RepairThemAll](https://dl.acm.org/doi/10.1145/3338906.3338911)(ground-truth labeled by Tian et al [from](https://conf.researchr.org/details/ase-2020/ase-2020-papers/3/Evaluating-Representation-Learning-of-Code-Changes-for-Predicting-Patch-Correctness-i) ) and [ManySStuBs](https://dl.acm.org/doi/10.1145/3379597.3387491).


* Results
  * RQ1: The detailed result files in RQ1, which are named by the format of `[model]_[classifier].csv`.
For example, the file named `BERT_DT.csv` in the folder `Tian's_dataset` means that this file is the result of patches from Tian's study embedded by **BERT** and classified by **Decision Tree**.
    * Tian's_dataset: The detailed result files on Tian's dataset. 
    * Cache_dataset: The detailed result files on our own dataset. 
    * Cross_dataset: The detailed result files of representation learning techniques when training on our own dataset and testing on Tian's dataset.

  * RQ2: The detailed result files in RQ2.
    * Wang_Cache.csv: The detailed result of Cache on the dataset from Wang's [ASE20](https://conf.researchr.org/details/ase-2020/ase-2020-papers/54/Automated-Patch-Correctness-Assessment-How-Far-are-We-) paper.
    * ODS_Cache.csv: The datailed result of Cache on the dataset from Xiong's [ICSE18](https://dl.acm.org/doi/10.1145/3180155.3180182) paper. We directly compare against the results reported by the authors of ODS on 139 patches from Xiong's paper since the data and source code of ODS is unavailable.

* Source: The source code and lib for running Cache.


## Prerequisite

* Java 1.7
* Python 3.6
* Defects4j 1.2
* Bugs.jar
* Bears
* QuixBugs


##　Preprocessing

#### Extract the buggy file and fixed file from patch


```python
git clone https://github.com/bugs-dot-jar/bugs-dot-jar  # Bugs.jar benchmark
git clone https://github.com/bears-bugs/bears-benchmark  # Bears benchmark
git clone https://github.com/jkoppel/QuixBugs # QuixBugs benchmark
# Follow the instructions in https://github.com/rjust/defects4j to install defect 4j1.2
```

```
python3 genOverfittingPatches.py
```

#### Generate the AST paths
We reuse the ast path extractor implemented by JetBrains Research in [here](https://github.com/JetBrains-Research/astminer).
To run the ASTMiner, execute the following command:
```sh
java -jar ./lib/astminer_revised.jar pathContexts --lang java --project path/to/project --output path/to/results --maxL L --maxW W --maxContexts C --maxTokens T --maxPaths P
```
For example:
```sh
java -Xms64g -Xmx128g -jar ./lib/astminer_revised.jar pathContexts --lang java --project ./materials --output ./dataset --maxH 9 --maxW 2 --maxContexts 200 --maxTokens 500 --maxPaths 500
```
Note that the space of memory the preprocessor will take up depends on the number of files and parameters. Usually, it will take up more than 60GB memory and we preproccess our dataset on a server with 128G memory.

#### Generate the sub-token level vocabulary
```sh
python3 genSubtokenVocab.py
```


## Training

```sh
python3 main.py
```



