import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    l=players.shape
    lst=[]
    for n in l:
        lst.append(n)
    return lst
    
    
    