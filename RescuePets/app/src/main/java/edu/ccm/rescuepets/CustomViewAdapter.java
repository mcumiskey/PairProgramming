package edu.ccm.rescuepets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/*Custom View adapted based on tutorial by digitalocean at: https://www.digitalocean.com/community/tutorials/android-listview-with-custom-adapter-example-tutorial */
public class CustomViewAdapter extends ArrayAdapter implements View.OnClickListener {
    private ArrayList<Pet> pet_list;
    Context mContext;

    //look up the view feilds we want to populate
    private static class ViewHolder {
        TextView petName;
        TextView petAge;
        TextView petDistance;
        ImageView petIcon;
        CheckBox petFavorite;
    }

    public CustomViewAdapter(ArrayList<Pet> pets, Context context) {
        super(context, R.layout.pet_card, pets);
        this.pet_list = pets;
        this.mContext = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Pet singlePet = (Pet) getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.pet_card, parent, false);

            viewHolder.petName = (TextView) convertView.findViewById(R.id.petName_textView);
            viewHolder.petAge = (TextView) convertView.findViewById(R.id.petAge_textView);
            viewHolder.petDistance = (TextView) convertView.findViewById(R.id.petDistance_textView);
            viewHolder.petIcon = (ImageView) convertView.findViewById(R.id.petIcon_dog_imageView);
            viewHolder.petFavorite = (CheckBox) convertView.findViewById(R.id.likePet_toggleButton);

            result = convertView;

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.petName.setText(singlePet.getName());
        viewHolder.petAge.setText(singlePet.getAge());
        viewHolder.petDistance.setText((int) singlePet.getDistance());
        //viewHolder.petIcon.setImageDrawable();
        viewHolder.petFavorite.setChecked(singlePet.pet_isFavorite);


        // Return the completed view to render on screen
        return convertView;
    }

    @Override
    public void onClick(View v) {
        //when one pet is clicked on
    }
}
