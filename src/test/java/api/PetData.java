package api;

import java.util.ArrayList;


class PetCategory{
    public int id;
    public String name;
}

class PetTagsData {
    public Integer id;
    public String name;

    public PetTagsData() {
        super();
    }

    public PetTagsData(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//

class PetData {
    public long id;
    public PetCategory category;
    public ArrayList<String> photoUrls;
    public ArrayList<PetTagsData> tags;
    public String name;
    public String status;

    public PetData() {
        super();
    }


    public PetData(long id, PetCategory category, ArrayList<String> photoUrls, ArrayList<PetTagsData> tags, String name, String status) {
        this.id = id;
        this.category = category;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.name = name;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}

