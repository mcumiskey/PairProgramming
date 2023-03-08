package edu.ccm.rescuepets;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class PetViewHolder extends RecyclerView.ViewHolder {
    TextView petName;
    TextView petAge;
    TextView petDistance;
    ImageView petIcon;
    CheckBox petFavorite;

    PetViewHolder(View itemView) {
        super(itemView);
        petName = (TextView) itemView.findViewById(R.id.petName_textView);
        petAge = (TextView) itemView.findViewById(R.id.petAge_textView);
        petDistance = (TextView) itemView.findViewById(R.id.petDistance_textView);
        ImageView petIcon = (ImageView) itemView.findViewById(R.id.petIcon_dog_imageView);
        CheckBox petFavorite = (CheckBox) itemView.findViewById(R.id.likePet_toggleButton);
    }
}
