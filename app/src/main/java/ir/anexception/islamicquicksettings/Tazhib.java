package ir.anexception.islamicquicksettings;

import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

public class Tazhib extends TileService {
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
                break;
            }
            case Tile.STATE_INACTIVE: {
                break;
            }
        }
    }
}
