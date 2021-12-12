import os, fnmatch
def travFolder(dir, files=[], suffix=''):
    listdirs = os.listdir(dir)
    for f in listdirs:
        pattern = '*.' + suffix if suffix != '' else '*.*'
        if os.path.isfile(os.path.join(dir, f)) and fnmatch.fnmatch(f, pattern):
            files.append(os.path.join(dir, f))
        elif os.path.isdir(os.path.join(dir, f)):
            travFolder(dir + '/' + f, files, suffix)
    return files