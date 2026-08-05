import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    lst=[]
    lst.append(len(players))
    lst.append(len(players.columns))
    return lst
    
    
    