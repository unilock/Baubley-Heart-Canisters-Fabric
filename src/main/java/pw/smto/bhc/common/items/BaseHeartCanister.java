package pw.smto.bhc.common.items;

import pw.smto.bhc.common.config.ConfigHandler;
import pw.smto.bhc.common.util.HeartType;

public class BaseHeartCanister extends BaseItem {

    public HeartType type;
    public BaseHeartCanister(HeartType type){
        super(ConfigHandler.general.heartStackSize.get());
        this.type = type;
    }
}
