package ir.anexception.islamicquicksettings;

import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

public class HajGhasem extends TileService {
    @Override
    public void onTileAdded() {
        super.onTileAdded();

        getQsTile().setState(Tile.STATE_ACTIVE);
        getQsTile().updateTile();
    }

    @Override
    public void onClick() {
        super.onClick();

        switch (getQsTile().getState()) {
            case Tile.STATE_ACTIVE: {
                getQsTile().setState(Tile.STATE_INACTIVE);
                break;
            }
            case Tile.STATE_INACTIVE: {
                getQsTile().setState(Tile.STATE_ACTIVE);
                break;
            }
        }
        getQsTile().updateTile();
    }
}
